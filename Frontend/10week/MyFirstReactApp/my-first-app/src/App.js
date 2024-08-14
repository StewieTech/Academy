import React from 'react'
import './App.css'
import UserProfile from './component/UserProfile/UserProfile';
import UserPosts from './component/UserPosts/UserPosts'

const userData = {
  name: 'John Doe',
  posts: ['Post 1','Post 2','Post 3']
};



const App = () => {
  return (
    <div className = "App">
      <UserProfile name = {userData.name}/>
      <UserPosts posts  = {userData.posts} />
      
    </div>
  )
}

export default App
