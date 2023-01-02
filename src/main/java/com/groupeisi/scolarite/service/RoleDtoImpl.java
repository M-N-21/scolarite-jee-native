package com.groupeisi.scolarite.service;

import com.groupeisi.scolarite.dao.IRole;
import com.groupeisi.scolarite.dao.RoleImpl;
import com.groupeisi.scolarite.dto.RoleDto;
import com.groupeisi.scolarite.entities.Roles;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

public class RoleDtoImpl implements IRoleDto {

	private RoleImpl rdao = new RoleImpl();
	@Override
	public int add(RoleDto roleDto) {
		
		return rdao.add(rdao.RoleDtoToAppRoleEntity(roleDto));
	}

	@Override
	public int delete(int id) {
		
		return rdao.delete(id, new Roles());
	}

	@Override
	public int update(RoleDto roleDto) {
		
		return rdao.update(rdao.RoleDtoToAppRoleEntity(roleDto));
	}

	@Override
	public List<RoleDto> list() {
		List<RoleDto> roleDtos = new ArrayList<RoleDto>();
		List<Roles> roles = rdao.list(new Roles());
		for (Roles r: roles) {
			if (roleDtos.isEmpty()){
				roleDtos.add(rdao.RoleEntityToAppRoleDto(r));
			}else{
				boolean trouve = false;
				for (RoleDto rdto: roleDtos) {
					//System.out.println(r.getName()+"/"+rdto.getName());
					if (r.getName().equals(rdto.getName())){
						trouve = true;
						break;
					}
				}
				if (!trouve)
					roleDtos.add(rdao.RoleEntityToAppRoleDto(r));
			}
		}
		/*rdao.list(new Roles()).forEach(role -> {
			roleDtos.add(rdao.RoleEntityToAppRoleDto(role));

			//System.out.println(rdao.RoleEntityToAppRoleDto(role).getName());
		});*/
		return roleDtos;
	}

	@Override
	public RoleDto get(int id) {
		
		return rdao.RoleEntityToAppRoleDto(rdao.get(id, new Roles()));
	}

}
