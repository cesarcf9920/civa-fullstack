# Exponer 2 endpoint
HOST="http://localhost:8080"
ENDPOINT="$HOST/marca/agregar"

# Listado de marcas
MARCAS=("Volvo" "Scania" "Fiat")

# Bucle para agregar cada marca
for marca in "${MARCAS[@]}"
do
  curl -X POST "$ENDPOINT" \
    -H "Content-Type: application/json" \
    -d "{\"nombre\": \"$marca\"}" \
    -w "\n"
done