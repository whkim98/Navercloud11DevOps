import { Alert } from '@mui/material';
import React, { useRef, useState } from 'react';

const FourApp = () => {
    const [result, setResult] = useState('');
    const nameRef = useRef('');
    const korRef = useRef(0);
    const engRef = useRef(0);
    return (
        <div>
            <Alert>FourApp - useRef 응용</Alert>
        </div>
    );
};

export default FourApp;