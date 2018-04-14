/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularuibootstrap;

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.plugins.PluginInformation;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;

/**
 * The Angular UI Sortable Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular UI Bootstrap",
		pluginDescription = "Bootstrap components written in pure AngularJS by the AngularUI Team",
		pluginUniqueName = "jwebswing-angular-ui-bootstrap",
		pluginVersion = "2.5.0",
		pluginCategories = "angular,bootstrap, ui,web ui, framework",
		pluginSubtitle = "Bootstrap components written in pure AngularJS by the AngularUI Team",
		pluginSourceUrl = "https://github.com/angular-ui/bootstrap",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-UI-Bootstrap/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-UI-Bootstrap",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://angular-ui.github.io/bootstrap/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularUIBootstrap.jar/download") class AngularUIBootstrapPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularUIBootstrapPageConfigurator
	 */
	public AngularUIBootstrapPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getBody()
			    .addJavaScriptReference(AngularUIBootstrapReferencePool.AngularUIBootstrap.getJavaScriptReference());
			page.getBody()
			    .addCssReference(AngularUIBootstrapReferencePool.AngularUIBootstrap.getCssReference());
			page.getAngular()
			    .getAngularModules()
			    .add(new AngularUIBootstrapModule());
		}
		return page;
	}
}