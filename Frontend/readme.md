# Frontend

## React

![alt text](image.png)
![alt text](image-1.png)

### Hooks

- useEffect for side effects

``` javascript
useEffect(() => {

},[]) // wiill run only once if empty array, if nothing is there will rerender multiple times
```

- useState update state. Imagine you want to update the count, you would use setCount. The title change would be a useEffect side effect
- useMemo caches expensive processes on rerender reloads
- useRef allows us to have a default value for more efficient handling of rerenders