import { Alert, Button } from '@mui/material';
import React, { useRef, useState } from 'react';

const ThreeApp = () => {
    const [count, setCount] = useState(1);
    const countRef = useRef(1);
    console.log("랜더링 중");

    const countIncre = () => setCount(count + 1);

    const countRefIncre = () => {
        countRef.current = countRef.current + 1;
        console.log(countRef.current);
    }
    return (
        <div>
            <Alert>ThreeApp - useRef 공부</Alert>
            <h1>state 변수: {count}</h1>
            <h1>ref 변수: {countRef.current}</h1>
            <hr/>
            <Button variant='contained' color='success' onClick={countIncre}>
                State변수 1 증가
            </Button>
            <br/><br/>
            <Button variant='contained' color='success' onClick={countRefIncre}>
                ref qustn 1증가
            </Button>
        </div>
    );
};

export default ThreeApp;