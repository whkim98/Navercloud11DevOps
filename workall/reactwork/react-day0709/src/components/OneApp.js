import { AccessAlarm, BookmarkAdd } from '@mui/icons-material';
import { Button } from '@mui/material';
import React from 'react';
import styled from 'styled-components';

const OneApp = () => {
    const Title = styled.h1`
        font-size: 1.5em;
        text-align: center;
        color: orange;
        background-color: pink;
    `;
    const MyButton = styled.button`
        color: orange;
        width: 200px;
        height: 60px;
        border: 1px solid pink;
        border-radius: 30px;
        margin-top: 10px;
    `;
    const MyButton2 = styled(MyButton)`
        color: blue;
        background-color: green;
        border: 2px solid gray;
    `;
    const Title2 = styled(Title)`
        border-radius: 50px;
    `;
    return (
        <div>
            <h3 className='alert alert-danger'>
                <AccessAlarm/>
                <BookmarkAdd/>
                OneApp-styled-components</h3>
                <h1>안녕</h1>
                <Title2>안녕</Title2>
                <hr/>
                <Button variant='outlined' color='success'>Hi</Button> &nbsp;
                <Button variant='contained' color='success'>Hi</Button> &nbsp;
                <MyButton>Hi</MyButton>
                <MyButton2>Hi</MyButton2>
        </div>
    );
};

export default OneApp;