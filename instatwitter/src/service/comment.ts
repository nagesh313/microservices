import axios from "axios"

export const getCommentsByPostId = async (postId: string) => {
    const comments = await axios.get(`/api/v1/comment/${postId}`)
    return comments;
}