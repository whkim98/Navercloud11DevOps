import axios from 'axios';
import React, { useEffect, useState } from 'react';
import ImageList from '@mui/material/ImageList';
import ImageListItem from '@mui/material/ImageListItem';
import ImageListItemBar from '@mui/material/ImageListItemBar';

const MyCarPhoto = () => {
    const [list,setList]=useState([]);

    const storage="https://kr.object.ncloudstorage.com/bitcamp-bucket-56/mycar";

    const dataList=()=>{
        axios.get("/mycar/list")
        .then(res=>{
            setList(res.data);
        })
    }

    useEffect(()=>{
        dataList();
    },[]);

    return (
        <ImageList sx={{ width: 500, height: 500 }}>
        {list.map((item,idx) => (
          <ImageListItem key={idx}>
            <img
              srcSet={`${storage}/${item.carphoto}?w=248&fit=crop&auto=format&dpr=2 2x`}
              src={`${storage}/${item.carphoto}?w=248&fit=crop&auto=format`}
              alt={item.carname}
              loading="lazy"
            />
            <ImageListItemBar
              style={{backgroundColor:'black',color:'white'}}
              title={item.carname}
              subtitle={<span style={{fontSize:'16px'}}>Price: {item.carprice}만</span>}
              position="below"
            />
          </ImageListItem>
        ))}
      </ImageList>
    );
};

export default MyCarPhoto;