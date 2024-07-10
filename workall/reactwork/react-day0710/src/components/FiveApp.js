import { Alert } from '@mui/material';
import React from 'react';
import FiveChildApp from './FiveChildApp';
import FiveChild2App from './FiveChild2App';

const FiveApp = () => {
    return (
        <div>
            <Alert>FiveApp - 부모/자식 component 통신 #1</Alert>
            <h5>FiveChildApp</h5>
            <FiveChildApp irum={'이영자'} age={23} addr={'서울'}/>
            <FiveChildApp irum={'박주용'} age={24} addr={'광주'}/>
            <FiveChildApp irum={'유상곤'} age={31} addr={'서산'}/>

            <h5>FiveChild2App</h5>
            <FiveChild2App irum={'이미자'} photo={'mycar11.png'} msg="노랑이차"/>
            <FiveChild2App irum={'강미자'} photo={'mycar13.png'} msg="분홍이차"/>
        </div>
    );
};

export default FiveApp;