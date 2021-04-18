import React from 'react'
import '../App.css'

const login = () =>{

    // botonClick = ()=>{
    //     console.log("Click en el boton iniciar");
    //     // document.getElementById('btn-iniciar').addEventListener('click', (e)=>{
    //     //     e.defaultPrevented();
    //     //     console.log("Click en el boton iniciar");
    //     // });
    // }

    const handleClick = () => {
        console.log("Click en el boton iniciar");
    }

    
    return (
        <div className="contenedor">
            <main className="form-signin">
                <form>
                    <h1 className="h3 mb-3 fw-normal">Iniciar sesion</h1> 

                    <div className="form-floating">
                    <input type="email" class="form-control" id="txtemail" placeholder="name@example.com"/>
                    <label for="txtemail">Email address</label>
                    </div>
                    <div className="form-floating">
                    <input type="password" className="form-control" id="txtpassword" placeholder="Password"/>
                    <label for="txtpassword">Password</label>
                    </div>

                    <button onClick={this.handleClick} className="w-100 btn btn-lg btn-primary" id="btn-iniciar" type="button">Sign in</button>
                    <p className="mt-5 mb-3 text-muted">&copy; 2017–2021</p>
                </form>
            </main>
        </div>

        
    );
    
}

export default login