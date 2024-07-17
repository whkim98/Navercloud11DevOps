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
                </tbody>
            </table>
        </div>
    );
};

export default BoardForm;