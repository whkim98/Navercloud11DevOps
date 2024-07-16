import { Alert } from '@mui/material';
import React from 'react';
import nofood from '../image/s10.JPG';
import { useParams } from 'react-router-dom';

const Food = () => {
    const {food1, food2} = useParams();
    return (
        <div>
            <Alert severity='error'>Food</Alert>
            <div style={{marginTop: '20px'}}>
                {
                    food1 == null && food2 == null ? 
                        <div>
                            <h3>오늘은 공부</h3>
                            <img alt='' src={nofood}/>
                        </div> :
                        food1 != null && food2 == null ?
                        <div>
                            <h2>빨간색 국밥</h2>
                            <img alt = '' src={require(`../image/${food1}.jpg`)} style={{width: '200px'}}/>
                        </div> :
                        <div>
                            <h2>후식</h2>
                            <img alt src={require(`../image/${food1}.jpg`)} style={{width: '200px'}}/>
                            &nbsp;&nbsp;
                            <img alt src={require(`../image/${food2}.jpg`)} style={{width: '200px'}}/>
                        </div>
                }
            </div>
        </div>
    );
};

export default Food;