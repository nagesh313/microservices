import { Divider, Typography, Avatar, ListItem, ListItemAvatar, ListItemText } from '@mui/material';
import React from 'react';

export const Comment = ({ comment }: any) => {
    return <>
        <ListItem alignItems="flex-start" sx={{ pt: 0, pb: 0 }} >
            <ListItemAvatar>
                <Avatar alt={comment?.createdBy?.substr(0, 1)?.toLocaleUpperCase()} src="/static/images/avatar/1.jpg" sx={{ width: 24, height: 24 }} />
            </ListItemAvatar>
            <ListItemText
                // primary={comment.content}
                secondary={
                    <React.Fragment>
                        <Typography
                            sx={{ display: 'inline' }}
                            component="span"
                            variant="body2"
                            color="text.primary"
                        >
                            {comment.createdBy}
                        </Typography>
                        {" — "}{comment.content}
                    </React.Fragment>
                }
            />
        </ListItem >
        <Divider component="li" />
    </>
};