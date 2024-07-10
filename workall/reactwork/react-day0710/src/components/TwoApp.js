import { Alert } from '@mui/material';
import React, { useState } from 'react';

const TwoApp = () => {
    const [msg, setMsg] = useState(["한가인", "캔디", "테리우스"]);
    const [inputValue, setInputValue] = useState("");

    const change = (e) => {
        setInputValue(e.target.value);
    };

    const addMessageEvent = () => {
        if (inputValue.trim() !== "") {
            setMsg([...msg, inputValue]);
            setInputValue("");
        }
    };

    const deleteMessage = (index) => {
        const newMsg = [...msg];
        newMsg.splice(index, 1);
        setMsg(newMsg);
    };

    return (
        <div>
            <Alert>TwoApp</Alert>
            <div>
                <table>
                    <tbody>
                        <tr>
                            <th>이름입력: </th>
                            <td>
                                <input
                                    type="text"
                                    name="name"
                                    className="form-control"
                                    style={{ width: '150px' }}
                                    value={inputValue}
                                    onChange={change}
                                />
                            </td>
                            <td>
                                <button
                                    type="button"
                                    style={{ color: 'red' }}
                                    onClick={addMessageEvent}
                                >
                                    추가
                                </button>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <hr />
                <table>
                    <tbody>
                        {
                            msg.map((m, i) => (
                                <tr key={i}>
                                    <td>{m}</td>
                                    <td>
                                        <button
                                            type="button"
                                            onClick={() => deleteMessage(i)}
                                        >
                                            삭제
                                        </button>
                                    </td>
                                </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
        </div>
    );
};

export default TwoApp;
