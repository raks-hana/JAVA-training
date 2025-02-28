import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
//import Component1 from './Component1'
//import App from './App.jsx'
import ABComponentForError from './ABComponentForError'
import ErrorBoundary from './ErrorBoundary'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <h2>Hi</h2>
    <ErrorBoundary>
      <ABComponentForError />
    </ErrorBoundary>
  </StrictMode>,
)
