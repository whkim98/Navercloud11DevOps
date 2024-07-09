import React from 'react';
import photo1 from '../image/17.jpg';

const TwoApp = () => {
    return (
        <div>
            <h3 className='alert alert-danger'>TwoApp-이미지</h3>
            <h5>import로 이미지</h5>
            <img alt="photo1" src={photo1} style={{width: '100px'}}></img>

            <h5>require로 이미지</h5>
            <img alt="photo2" src={require(`../image/19.jpg`)} style={{width: '100px'}}/>
        </div>
    );
};

export default TwoApp;