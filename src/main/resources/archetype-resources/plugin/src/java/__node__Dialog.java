package ${package};

import org.knime.core.data.DataTableSpec;
import org.knime.core.node.InvalidSettingsException;
import org.knime.core.node.NodeSettingsRO;
import org.knime.core.node.NodeSettingsWO;
import org.knime.core.node.NotConfigurableException;
import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;
import org.knime.core.node.port.PortObjectSpec;

import nl.esciencecenter.e3dchem.python.PythonOptionsPanel;

/**
 * <code>NodeDialog</code> for the "${node}" Node.
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}.
 */
public class ${node}Dialog extends DefaultNodeSettingsPane {
	private PythonOptionsPanel<${node}Config> pythonOptions;

    /**
     * New pane for configuring ${node} node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     */
    protected ${node}Dialog() {
        super();
		${node}Config config = new ${node}Config();

        SettingsModelIntegerBounded count = config.getCount();
        addDialogComponent(new DialogComponentNumber(count, "Counter", 1, 5));

        pythonOptions = new PythonOptionsPanel<${node}Config>();
		addTab("Python options", pythonOptions);
    }

    @Override
	public void loadAdditionalSettingsFrom(NodeSettingsRO settings, PortObjectSpec[] specs)
			throws NotConfigurableException {
		super.loadAdditionalSettingsFrom(settings, specs);
		${node}Config config = new ${node}Config();
		try {
			config.loadFrom(settings);
		} catch (InvalidSettingsException e) {
			throw new NotConfigurableException("Unable to load", e);
		}
		pythonOptions.loadSettingsFrom(config);
	}

	@Override
	public void loadAdditionalSettingsFrom(NodeSettingsRO settings, DataTableSpec[] specs)
			throws NotConfigurableException {
		super.loadAdditionalSettingsFrom(settings, specs);
		${node}Config config = new ${node}Config();
		try {
			config.loadFrom(settings);
		} catch (InvalidSettingsException e) {
			throw new NotConfigurableException("Unable to load", e);
		}
		pythonOptions.loadSettingsFrom(config);
	}

	@Override
	public void saveAdditionalSettingsTo(NodeSettingsWO settings) throws InvalidSettingsException {
		super.saveAdditionalSettingsTo(settings);
		${node}Config config = new ${node}Config();
		pythonOptions.saveSettingsTo(config);
		config.saveTo(settings);
	}
}
