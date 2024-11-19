import { useState, useEffect } from "react";
import type { Bus } from "../types/bus";

const useBuses = () => {
  const [buses, setBuses] = useState([] as Bus[]);

  const fetchBuses = async () => {
    
    const response = await fetch("http://localhost:8080/bus");
    const data = await response.json();
    setBuses(data);
  };

  useEffect(() => {
    fetchBuses();
  }, [fetchBuses]);

  return buses;
};

export default useBuses;
