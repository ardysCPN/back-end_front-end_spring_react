import React from 'react';
import NavBar from './NavBar';
import Table from './Table';

function ListaGeneros() {

  const texto = "Peliculas IUDigital";

  return (
    <div className="container">
       <NavBar titulo={texto}/>
       <Table />
    </div>
  );
}

export default ListaGeneros;