package acme.features.any.toolkit;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.toolkits.ArtefactToolkit;
import acme.entities.toolkits.Toolkit;
import acme.framework.components.models.Model;
import acme.framework.controllers.Request;
import acme.framework.roles.Any;
import acme.framework.services.AbstractShowService;

@Service
public class AnyToolkitShowService implements AbstractShowService<Any, Toolkit>{
	
	// Internal state -------------------------------------------------------------------
	
	@Autowired
	protected AnyToolkitRepository repository;
	
	// AbstractShowService<Authenticated, Toolkit> interface ----------------------------

	@Override
	public boolean authorise(final Request<Toolkit> request) {
		assert request != null;
		
		return true;
	}

	@Override
	public Toolkit findOne(final Request<Toolkit> request) {
		assert request != null;
		
		Toolkit result;
		int id;
		
		id = request.getModel().getInteger("id");
		result = this.repository.findOneToolkitById(id);
		
		return result;
	}

	@Override
	public void unbind(final Request<Toolkit> request, final Toolkit entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		
		double price=0;
		final Collection<ArtefactToolkit> artefactToolkits = this.repository.findArtefactToolkitByToolKit(entity.getId());
		for(final ArtefactToolkit a :artefactToolkits) {
			price += a.getAmount()*a.getArtefact().getRetailPrice().getAmount();
		}
		model.setAttribute("price", price);
		request.unbind(entity, model,"code", "title", "description", "assemblyNotes", "info","id");
		
	}

}