import React, { useState } from 'react';
import photo1 from '../image/17.jpg';

const TwoApp = () => {
    const [photo,setPhoto]=useState('18');

    //radio event
    const radioClick=(e)=>{
        setPhoto(e.target.value);
    }

    return (
        <div>
            <h3 className='alert alert-danger'>TwoApp-이미지를 불러오는 또다른 방법</h3>
            <h5>import 를 이용해서 이미지 가져오기</h5>
            <img alt="photo1" src={photo1} style={{width:'100px'}}/>

            <h5>require 를 이용해서 이미지 가져오기</h5>
            <img alt="photo2" src={require(`../image/19.jpg`)} 
            style={{width:'100px'}}/>
            <hr/>
            <h5>radio 를 이용해서 이미지 나타내기</h5>
            <label>
                <input type='radio' name='photo' 
                defaultValue={'17'}
                onClick={radioClick}/>신민아
            </label>
            &nbsp;
            <label>
                <input type='radio' name='photo' 
                defaultValue={'18'} defaultChecked
                onClick={radioClick}/>신세경
            </label>
            &nbsp;
            <label>
                <input type='radio' name='photo' 
                defaultValue={'20'}
                onClick={radioClick}/>유아인
            </label>
            &nbsp;
            <label>
                <input type='radio' name='photo' 
                defaultValue={'19'}
                onClick={radioClick}/>설현
            </label>
            <br/><br/>
            <img alt="photo" 
            src={require(`../image/${photo}.jpg`)}
            style={{width:'200px',marginLeft:'100px'}}/>
         </div>
    );
};

export default TwoApp;