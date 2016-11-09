/**
 * 
 */
package com.jprh.common.wdm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jprh.common.wdm.dao.WasteCollectionSourceDAO;
import com.jprh.common.wdm.model.WasteCollectionSource;

/**
 * @author jon.holmes
 *
 */
@Transactional
@Service
public class WasteCollectionSourceServiceImpl implements WasteCollectionSourceService {
	
    @Autowired
    private WasteCollectionSourceDAO wasteCollectionSourceDAO;	

	public void createNewWasteCollectionSource(WasteCollectionSource wasteCollectionSource) {
		wasteCollectionSourceDAO.persist(wasteCollectionSource);
	}

	public List<WasteCollectionSource> findAll() {
		return wasteCollectionSourceDAO.findAll();
	}

	public WasteCollectionSource findById(String id) {
		return wasteCollectionSourceDAO.findById(id);
	}
}
