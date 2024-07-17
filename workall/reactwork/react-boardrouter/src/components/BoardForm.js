import { CameraAltOutlined} from '@mui/icons-material';
import { Alert } from '@mui/material';
import React from 'react';
import InputEmojiWithRef from 'react-input-emoji';

const BoardForm = () => {
    return (
        <div>
            <Alert>게시판 글쓰기</Alert>
            <table className='table table-bordered' style={{width: '300px'}}>
                <tbody>
                    <tr>
                        <th className='table-info' style={{width: '100px'}}>작성자</th>
                        <td>
                            <input type='text' className='form-control'/>
                        </td>
                    </tr>
                    <tr>
                        <th className='table-info' style={{width: '100px'}}>비밀번호</th>
                        <td>
                            <input type='password' className='form-control'/>
                        </td>
                    </tr>
                    <tr>
                        <td colSpan={2}>
                            <InputEmojiWithRef 
                            placeholder='제목 입력'
                            cleanOnEnter
                            onEnter={(text) => {
                                console.log(text);
                            }}/>
                        </td>
                    </tr>
                    <tr>
                        <td colSpan={2}>
                            <input type='file' style={{display: 'none'}}/>
                            <CameraAltOutlined/>
                            <textarea style={{width: '100%', height: '150px'}} 
                            placeholder='내용을 입력해 주세요' className='form-control'></textarea>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
};

export default BoardForm;