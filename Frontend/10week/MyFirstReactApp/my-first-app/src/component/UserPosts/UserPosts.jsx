import React from 'react';
import './UserPosts.css';

const UserPosts = ({ posts  }) => {
  return (
    <div>
 <h1>User Posts</h1>;
 <ul>
{posts.map((post,index) => (
  <li key={index}>{post}</li>
))}
 </ul>
    </div>
  );
};

export default UserPosts;