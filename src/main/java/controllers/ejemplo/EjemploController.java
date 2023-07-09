
package controllers.ejemplo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import controllers.AbstractController;
import domain.Ejemplo;
import services.EjemploService;

@Controller
@RequestMapping("/ejemplo")
public class EjemploController extends AbstractController {

	@Autowired
	private EjemploService ejemploservicio;


	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		final ModelAndView result;
		final Collection<Ejemplo> ejemplo;
		ejemplo = this.ejemploservicio.findAll();
		result = new ModelAndView("ejemplo/list");
		result.addObject("requestURI", "example/list.do");
		result.addObject("ejemplo", ejemplo);

		return result;

	}
}
