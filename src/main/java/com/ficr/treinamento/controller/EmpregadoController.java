package com.ficr.treinamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ficr.treinamento.model.Empregado;
import com.ficr.treinamento.repository.EmpregadoRepository;

@RestController
@RequestMapping("/empregados")
@CrossOrigin(origins = "*")
public class EmpregadoController {

	@Autowired
	private EmpregadoRepository erp;

	@GetMapping("/empregados")
	@ResponseStatus(HttpStatus.OK)
	public List<Empregado> list() {
		return erp.findAll();
	}

	@GetMapping("/empregados/{matricula}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Empregado> showEmpregado(@PathVariable Long matricula) {
		return erp.findById(matricula);

	}

	@PostMapping("/empregado")
	@ResponseStatus(HttpStatus.CREATED)
	public Empregado addEmpregado(@RequestBody Empregado empregado) {
		return erp.save(empregado);

	}

	@PutMapping("/empregado")
	@ResponseStatus(HttpStatus.OK)
	public Empregado updateEmpregado(@RequestBody Empregado empregado) {
		return erp.save(empregado);
	}

	@DeleteMapping("/empregados/{matricula}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteEmpregado(@PathVariable Long matricula) {
		erp.deleteById(matricula);
	}

}
