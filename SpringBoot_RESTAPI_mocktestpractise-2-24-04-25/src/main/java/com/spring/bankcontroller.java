package com.spring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banks")
public class bankcontroller {
	@Autowired
	private bankrepo br;
	@PostMapping()
	public Bank createbank(@RequestBody Bank b) {
		return br.save(b);
		
	}
	@GetMapping("/{pageNo}/{pageSize}")
	public Page<Bank> getallbanks(@PathVariable int pageNo,@PathVariable int pageSize){
		Pageable p=PageRequest.of(pageNo, pageSize);
		return br.findAll(p);
		
	}
	@GetMapping("{sort}")
	public Iterable<Bank> getallsort(@RequestParam String field1){
		return br.findAll(Sort.by(Direction.ASC,field1));
		
	}
	@GetMapping("/{id}")
	public Optional<Bank> getbyid(@PathVariable Long id) {
		return br.findById(id);
		
	}
	@PutMapping("/{id}")
	public Bank updatebank(@PathVariable Long id,@RequestBody Bank b) {
		Bank bb=br.findById(id).get();
		bb.setBname(b.getBname());
		bb.setPhno(b.getPhno());
		return br.save(b);
		
	}
	@DeleteMapping("/{id}")
	public void deletebank(@PathVariable Long id) {
		br.deleteById(id);
	}
}
