package br.com.exemplo.pacientes_api.service;

import br.com.exemplo.pacientes_api.exception.RecursoNaoEcontradoException;
import br.com.exemplo.pacientes_api.model.Paciente;
import br.com.exemplo.pacientes_api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Transactional
    public Paciente criarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Transactional(readOnly = true)
    public List<Paciente> listarTodosPacientes() {
        return pacienteRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Paciente buscarPacientePorId(Long id) {
        return pacienteRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEcontradoException("Paciente não encontrado com ID: " + id));
    }

    @Transactional
    public Paciente atualizarPaciente(Long id, Paciente pacienteAtualizado) {
        Paciente pacienteExistente = buscarPacientePorId(id);
        pacienteExistente.setNome(pacienteAtualizado.getNome());
        pacienteExistente.setIdade(pacienteAtualizado.getIdade());
        pacienteExistente.setRaca(pacienteAtualizado.getRaca());
        pacienteExistente.setTutorResponsavel(pacienteAtualizado.getTutorResponsavel());
        return pacienteRepository.save(pacienteExistente);
    }

    @Transactional
    public void deletarPaciente(Long id) {
        if (!pacienteRepository.existsById(id)) {
            throw new RecursoNaoEcontradoException("Paciente não encontrado com ID: " + id);
        }
        pacienteRepository.deleteById(id);
    }
}