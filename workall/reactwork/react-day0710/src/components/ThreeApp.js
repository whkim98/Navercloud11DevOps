import { Alert } from '@mui/material';
import React, { useRef, useState } from 'react';

const ThreeApp = () => {
    const [count, setCount] = useState(1);
    const countRef = useRef(1);
    console.log("랜더링 중");
    return (
        <div>
            <Alert>ThreeApp - useRef 공부</Alert>
            <h1>state 변수: {count}</h1>
            <h1>ref 변수: {countRef.current}</h1>
        </div>
    );
};

export default ThreeApp;