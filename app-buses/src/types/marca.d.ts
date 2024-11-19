import z from "zod";
import { busSchema } from "./bus";

export const marcaSchema = z.object({
  id: z.number(),
  nombre: z.number(),
  buses: z.array(busSchema),
});

export type Marca = z.infer<typeof Marca>;
