package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.model.Empresa;
import com.proyecto.service.IEmpresaService;
import com.proyecto.util.MessageStatus;
import com.proyecto.util.ResponseData;

@RestController
@RequestMapping("empresa")
public class EmpresaController {
	@Autowired
	private IEmpresaService service;

	// listar
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData<List<Empresa>> listar() {
		List<Empresa> item = null;
		try {
			item = service.listar();
		} catch (Exception e) {
			return new ResponseData<List<Empresa>>(item, HttpStatus.NOT_ACCEPTABLE.value(), MessageStatus.titleList,
					e.getMessage());
		}
		return new ResponseData<List<Empresa>>(item, HttpStatus.OK.value(), MessageStatus.titleList,
				MessageStatus.textLists);
	}

	// listarID
	@GetMapping(value = "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData<Empresa> listarId(@PathVariable("id") Long id) {
		Empresa item = null;
		try {
			item = service.listarId(id);
		} catch (Exception e) {
			return new ResponseData<Empresa>(item, HttpStatus.NOT_ACCEPTABLE.value(), MessageStatus.titleListId,
					e.getMessage());
		}
		return new ResponseData<Empresa>(item, HttpStatus.OK.value(), MessageStatus.titleListId,
				MessageStatus.textBusquedaSuccess);
	}

	// eliminar
	@DeleteMapping(value = "/eliminar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData<Integer> eliminar(@PathVariable Long id) {
		int item = 0;
		try {
			service.eliminar(id);
			item = 1;
		} catch (Exception e) {
			System.out.println(e.toString());
			item = 0;
			return new ResponseData<Integer>(item, HttpStatus.NOT_ACCEPTABLE.value(), MessageStatus.titleDelete,
					e.getMessage());
		}

		return new ResponseData<Integer>(item, HttpStatus.OK.value(), MessageStatus.titleDelete,
				MessageStatus.textDeleteSuccess);
	}

	// actualizar Insertar

	@PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData<Empresa> actualizar(@RequestBody Empresa data) {
		Empresa item = null;
		try {
			item = service.actualizar(data);

		} catch (Exception e) {
			item = null;
			return new ResponseData<Empresa>(item, HttpStatus.NOT_ACCEPTABLE.value(), MessageStatus.titleUpdate,
					e.getMessage());
		}

		return new ResponseData<Empresa>(item, HttpStatus.OK.value(), MessageStatus.titleUpdate,
				MessageStatus.textUpdateSuccess);
	}

	// Insertar
	@PostMapping(value = "/insertar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData<Empresa> insertar(@RequestBody Empresa data) {
		Empresa item = null;
		System.out.println(data.toString());
		try {

			item = service.insertar(data);

		} catch (Exception e) {
			item = null;
			return new ResponseData<Empresa>(item, HttpStatus.NOT_ACCEPTABLE.value(), MessageStatus.titleInsert,
					e.getMessage());
		}
		return new ResponseData<Empresa>(item, HttpStatus.OK.value(), MessageStatus.titleInsert,
				MessageStatus.textInsertSuccess);
	}
}
