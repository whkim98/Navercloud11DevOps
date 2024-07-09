import React, { useState } from 'react';
import photo1 from '../image/17.jpg';

const TwoApp = () => {
    const [photo, setPhoto]=useState('18');
    const radioClick=(e)=>{
        setPhoto(e.target.value);
    }
    return (
        <div>
            <h3 className='alert alert-danger'>TwoApp-이미지</h3>
            <h5>import로 이미지</h5>
            <img alt="photo1" src={photo1} style={{width: '100px'}}></img>

            <h5>require로 이미지</h5>
            <img alt="photo2" src={require(`../image/19.jpg`)} style={{width: '100px'}}/>
            <hr/>

            <h5>radio 이미지</h5>
            <label>
                <input type="radio" name="photo" defaultValue={'17'} onclick={radioClick}/>김우형
            </label>
            &nbsp;
            <label>
                <input type="radio" name="photo" defaultValue={'18'} defaultChecked onclick={radioClick}/>강동원
            </label>
            &nbsp;
            <label>
                <input type="radio" name="photo" defaultValue={'19'} onclick={radioClick}/>유해진
            </label>
            &nbsp;
            <label>
                <input type="radio" name="photo" defaultValue={'20'} onclick={radioClick}/>강호동
            </label>
            <br/>
            <img alt="photo" 
            src={require(`../image/${photo}.jpg`)} 
            style={{width: '300px', marginLeft: '100px'}}/>
        </div>
    );
};

export default TwoApp;