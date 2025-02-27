import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import Message from './Message.jsx'
import UserInput from './UserInput.jsx'
import StudentDetails from './StudentDetails.jsx'
import Thank from './Thank.jsx'
import Copyright from './Copyright.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App />
    <Message />
    <UserInput />
    <StudentDetails />
    <Thank />
    <Copyright />
  </StrictMode>,
)
