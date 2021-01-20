package com.unsplash.app.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.unsplash.app.dto.Root;

public class CollectionFiltrado {

	/**
	 * Este metodo puede filtrar por los campos del JSON root siguientes: id, title,
	 * description, cover_photo.id.
	 * 
	 * @param root   JSON completo de la Collections
	 * @param patron a filtrar
	 * @return root filtrado por el patron
	 */
	public Object[] filtrar(Root[] root, String patron) {
		if (StringUtils.isNotEmpty(patron)) {
			List<Root> rootista = new ArrayList<Root>();
			for (Root r : root) {
				if (r.getId().contains(patron) 
						|| r.getTitle().contains(patron)
						|| (StringUtils.isNotEmpty(r.getDescription()) && r.getDescription().contains(patron))
						|| r.getCover_photo().getId().contains(patron)) {
					rootista.add(r);
				}
			}
			return rootista.toArray();
		}
		return root;
	}

}
