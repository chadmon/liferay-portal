/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

import ClayButton from '@clayui/button';
import classnames from 'classnames';
import React, {useState} from 'react';

import * as DefaultVariant from '../../../core/components/PageRenderer/DefaultVariant.es';
import {useConfig} from '../../../core/hooks/useConfig.es';
import {MultiStep} from '../components/MultiStep.es';
import {PaginationControls} from '../components/PaginationControls.es';
import PartialResults from '../components/PartialResults';

export function Column({children, column, columnRef, editable, ...otherProps}) {
	const firstField = column.fields[0];

	return (
		<DefaultVariant.Column
			{...otherProps}
			column={column}
			columnClassName={classnames({
				hide: firstField?.hideField && !editable,
			})}
			ref={columnRef}
		>
			{children}
		</DefaultVariant.Column>
	);
}

Column.displayName = 'WizardVariant.Column';

export function Container({
	activePage,
	children,
	editable,
	pageIndex,
	pages,
	readOnly,
	strings = null,
}) {
	const [showReport, setShowReport] = useState(false);

	const {
		ffShowPartialResultsEnabled,
		formReportDataURL,
		hasDescription,
		showSubmitButton,
		submitLabel,
	} = useConfig();

	const onClick = () => {
		setShowReport(true);
	};

	if (showReport) {
		const alertElement = document.querySelector(
			'.lfr-ddm__show-partial-results-alert'
		);

		alertElement.classList.add(
			'lfr-ddm__show-partial-results-alert--hidden'
		);
	}

	return (
		<>
			{showReport ? (
				<PartialResults
					hasDescription={hasDescription}
					onShow={() => setShowReport(false)}
					reportDataURL={formReportDataURL}
				/>
			) : (
				<div className="ddm-form-page-container wizard">
					{pages.length > 1 && pageIndex === activePage && (
						<MultiStep
							activePage={activePage}
							editable={editable}
							pages={pages}
						/>
					)}

					<div
						className={classnames(
							'ddm-layout-builder ddm-page-container-layout',
							{
								hide: activePage !== pageIndex,
							}
						)}
					>
						<div className="form-builder-layout">{children}</div>
					</div>

					{pageIndex === activePage && (
						<>
							{pages.length > 0 && (
								<PaginationControls
									activePage={activePage}
									onClick={onClick}
									readOnly={readOnly}
									showSubmitButton={showSubmitButton}
									strings={strings}
									submitLabel={submitLabel}
									total={pages.length}
								/>
							)}

							{!pages.length && showSubmitButton && (
								<ClayButton
									className={
										ffShowPartialResultsEnabled
											? 'float-left'
											: 'float-right'
									}
									id="ddm-form-submit"
									type="submit"
								>
									{submitLabel}
								</ClayButton>
							)}
						</>
					)}
				</div>
			)}
		</>
	);
}

Container.displayName = 'WizardVariant.Container';
