import { Alert } from '@mui/material';
import React, { useState } from 'react';
import SixChild1App from './SixChild1App';

const SixApp = () => {
    const [count, setCount]=useState(0);
    const countIncre = () => setCount(count + 1);
    return (
        <div>
            <Alert>SixApp - 부모/자식 통신 #2</Alert>
            <Alert severity='error' style={{fontSize: '20px'}}>회원 방문 횟수: {count}회</Alert>
            <SixChild1App carname = "아반떼" carphoto = "mycar8.png" 
            bgcolor = "#ffc0cb" carprice = "3500" onIncre = {countIncre}/>
            <SixChild1App carname = "그렌져" carphoto = "mycar5.png" 
            bgcolor = "#7fffd4" carprice = "4700" onIncre = {countIncre}/>
        </div>
    );
};

export default SixApp;