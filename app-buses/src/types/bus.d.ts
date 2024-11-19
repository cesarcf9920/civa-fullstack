import z from "zod";

export const busSchema = z.object({
  id: z.number(),
  numeroBus: z.string(),
  placa: z.string(),
  fechaCreacion: z.string(),
  caracteristicas: z.string(),
});

export type Bus = z.infer<typeof busSchema>;
