import useBuses from "../hooks/useBuses";

const ListadoBusesComponent = () => {
  const buses = useBuses();

  return (
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>numeroBus</th>
          <th>placa</th>
          <th>Fecha de Creación</th>
          <th>Características</th>
        </tr>
      </thead>
      <tbody>
        {buses.map((bus) => (
          <tr key={bus.id}>
            <td>{bus.id}</td>
            <td>{bus.numeroBus}</td>
            <td>{bus.placa}</td>
            <td>{bus.fechaCreacion}</td>
            <td>{bus.caracteristicas}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
};

export default ListadoBusesComponent;
