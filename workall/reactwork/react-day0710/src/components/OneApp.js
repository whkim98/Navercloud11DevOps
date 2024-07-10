import { DeleteForeverOutlined } from '@mui/icons-material';
import { Alert } from '@mui/material';
import React, { useState } from 'react';

const OneApp = () => {
    const [msg, setMsg] = useState(["Happy", "안녕", "bitcamp"]);

    const addMessageEvent = (e) => {
        if(e.key === "Enter"){
            setMsg(msg.concat(e.target.value));
            e.target.value="";
        }
    }
    const deleteMessage=(i)=>{
        // setMsg(
        //     [
        //         ...msg.slice(0, i),
        //         ...msg.slice(i + 1, msg.length)
        //     ]
        // )
        setMsg(msg.filter((m, n) => n!== i));
    }
    return (
        <div>
            <Alert>OneApp - 배열 데이터</Alert>
            <hr/>
            <input type="text" className='form-control' style={{width: '300px'}} placeholder='메세지 입력 후 엔터'
            onKeyUp={addMessageEvent}></input>
            <h6 style={{color: 'red'}}>배열 데이터 출력</h6>
            <Alert severity='info'>총 {msg.length}개의 메세지</Alert>
            {
                msg &&
                msg.map((m, i) => 
                <h6 key={i}>{m}
                    &nbsp;&nbsp;
                    <DeleteForeverOutlined style={{cursor: 'pointer'}}
                    onClick={()=>deleteMessage(i)}/>
                </h6>)
            }
        </div>
    );
};

export default OneApp;