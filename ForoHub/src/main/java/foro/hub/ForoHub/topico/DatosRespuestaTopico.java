package foro.hub.ForoHub.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fecha_creacion, Boolean status,
                                   Curso curso) {
}
