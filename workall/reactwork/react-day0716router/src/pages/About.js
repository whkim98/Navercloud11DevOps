import { Alert } from '@mui/material';
import React from 'react';
import { useParams } from 'react-router-dom';

const About = () => {
    const {emp} = useParams();
    return (
        <div>
            <Alert severity='info'>About</Alert>
            <div style={{marginTop: '20px'}}>
                {
                    emp==null ?
                    <div>
                        <h1>취준중입니다</h1>
                    </div>
                    :
                    <div>
                        <h1>저는 {emp}에 다니고 있어요</h1>
                    </div>
                }
            </div>
        </div>
    );
};

export default About;