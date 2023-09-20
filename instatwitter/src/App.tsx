import { Container } from '@mui/material';
import './App.css';
import { Posts } from './Post/Posts';

function App() {
  return (
    <div className="App">
      <Container maxWidth='sm'>
        <Posts></Posts>
      </Container>
    </div>
  );
}

export default App;
