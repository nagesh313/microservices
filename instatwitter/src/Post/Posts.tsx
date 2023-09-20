import { Box, Typography } from '@mui/material';
import { useEffect, useState } from 'react';
import { getAllPosts } from '../service/post';
import { Post } from './Post';
export const Posts = () => {
    const [posts, setPosts] = useState<any>([]);
    useEffect(() => {
        getAllPosts().then((response: any) => {
            setPosts(response.data);
        })
    }, [])
    return (<>
        <Typography>Posts</Typography>
        <Box >
            {posts?.map((post: any, index: number) => {
                return <Post key={index} post={post}></Post>
            })}
        </Box>
    </>
    );
}