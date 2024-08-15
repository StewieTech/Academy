import React from 'react';
        import { render } from '@testing-library/react';
        import SumContext from './SumContext';
        
        test('renders SumContext component', () => {
            render(<SumContext />);
        });