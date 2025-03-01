import {useContext} from 'react';
import {AppContext} from '../context';
import {steps} from '../utils/constants';
import Invites from './Invites';
import SetupDXPCloud from './SetupDXPCloud';
import SuccessDXPCloud from './SuccessDXPCloud';
import Welcome from './Welcome';

const Pages = () => {
	const [{project, step, userAccount}] = useContext(AppContext);

	if (step === steps.invites) {
		return <Invites />;
	}

	if (step === steps.dxpCloud) {
		return <SetupDXPCloud />;
	}

	if (step === steps.successDxpCloud) {
		return <SuccessDXPCloud />;
	}

	if (userAccount && project) {
		return <Welcome project={project} userAccount={userAccount} />;
	}

	return <Welcome.Skeleton />;
};

export default Pages;
