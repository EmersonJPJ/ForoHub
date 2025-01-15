package foro.hub.ForoHub.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id, String titulo, String mensaje, LocalDateTime fecha_creacion,Boolean status,
                                 Curso curso) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(),topico.getFecha_creacion(),topico.getStatus(),topico.getCurso());
    }
}
