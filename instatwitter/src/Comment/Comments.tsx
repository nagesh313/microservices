import List from '@mui/material/List';
import React, { useEffect } from 'react';
import { getCommentsByPostId } from '../service/comment';
import { Comment } from './Comment';

export const Comments = ({ postId }: any) => {
    const [commentList, setCommentList] = React.useState([]);
    useEffect(() => {
        getCommentsByPostId(postId).then((comment: any) => {
            setCommentList(comment.data);
        })
    }, [postId])
    return (
        <List sx={{ width: '100%', bgcolor: 'background.paper', pt: 1, pb: 1 }} >
            {commentList.map((comment: any, index: number) => {
                return <Comment key={index} comment={comment}></Comment>
            })}
        </List>
    );
}