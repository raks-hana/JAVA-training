import React, { Suspense } from "react";
import Component5 from "../../folder1/Component5"
const Component3 = React.lazy(()=>import('../folder/Component3'))
const Component4 = React.lazy(()=>import('../../folder1/Component4'))

function Component2(){
    return (
    <>
    <h2>From Component2</h2>
    <Suspense fallback = {<h1>Loading Component3...</h1>}>
     <Component3 />
    </Suspense>
    <Suspense fallback = {<h1>Loading Component4...</h1>}>
     <Component4 />
    </Suspense>
    <Component5 />
    </>
    );
}
export default Component2