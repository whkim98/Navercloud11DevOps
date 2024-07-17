import { CameraAltOutlined} from '@mui/icons-material';
import { Alert, Button } from '@mui/material';
import React, { useRef, useState } from 'react';
import InputEmojiWithRef from 'react-input-emoji';

const BoardForm = () => {

    const [writer, setWriter] = useState('');
    const [pass, setPass] = useState('');
    const [subject, setSubject] = useState('');
    const [photo, setPhoto] = useState("no");

    const fileRef = useRef(null);
    const contentRef = useRef(null);

    const storage = process.env.REACT_APP_STORAGE;
    console.log(storage);

    const uploadPhoto = (e) => {
        const uploadFile = e.target.files[0];
        const uploadForm = new FormData();
        uploadForm.append("upload", uploadFile);
    }

    const dataSaveEvent = () => {

    }

    return (
        <div>
            <Alert>게시판 글쓰기</Alert>
            <table className='table table-bordered' style={{width: '300px'}}>
                <tbody>
                    <tr>
                        <th className='table-info' style={{width: '100px'}}>작성자</th>
                        <td>
                            <input type='text' className='form-control' value={writer}
                            onChange={(e) => setWriter(e.target.value)}/>
                        </td>
                    </tr>
                    <tr>
                        <th className='table-info' style={{width: '100px'}}>비밀번호</th>
                        <td>
                            <input type='password' className='form-control' value={pass}
                            onChange={(e) => setPass(e.target.value)}/>
                        </td>
                    </tr>
                    <tr>
                        <td colSpan={2}>
                            <InputEmojiWithRef 
                            placeholder='제목 입력'
                            cleanOnEnter
                            onEnter={(text) => {
                                console.log(text);
                                setSubject(text);
                            }}/>
                        </td>
                    </tr>
                    <tr>
                        <td colSpan={2}>
                            <input type='file' style={{display: 'none'}} ref={fileRef}
                            onChange={uploadPhoto}/>
                            <CameraAltOutlined onClick={()=>fileRef.current.click()} 
                            style={{cursor: 'pointer', fontSize: '30px'}}/>

                            <img alt="" src={`${storage}/${photo}`} style={{width: '60px', marginLeft: '30px'}}/>

                            <textarea style={{width: '100%', height: '150px'}} 
                            placeholder='내용을 입력해 주세요' className='form-control'>
                            </textarea>
                        </td>
                    </tr>
                    <tr>
                        <td colSpan={2} align='center'>
                            <Button variant='contained' color='success'
                            style={{width: '100px'}}
                            onClick={dataSaveEvent}>저장</Button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
};

export default BoardForm;