
package com.jesicahoffman.portfolio.service;

import com.jesicahoffman.portfolio.model.SobreMi;
import java.util.List;

public interface ISobreMiService {
    
    public List<SobreMi> verSobreMi();
    public void crearSobreMi(SobreMi per);
    public void borrarSobreMi(Long id);
    public SobreMi editarSobreMi(SobreMi per);
}
