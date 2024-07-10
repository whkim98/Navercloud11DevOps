import { Alert } from '@mui/material';
import React from 'react';
import FiveChildApp from './FiveChildApp';

const FiveApp = () => {
    return (
        <div>
            <Alert>FiveApp - 부모/자식 component 통신 #1</Alert>
            <h5>FiveChildApp</h5>
            <FiveChildApp irum={'이영자'} age={23} addr={'서울'}/>
            <FiveChildApp irum={'박주용'} age={24} addr={'광주'}/>
            <FiveChildApp irum={'유상곤'} age={31} addr={'서산'}/>
        </div>
    );
};

export default FiveApp;