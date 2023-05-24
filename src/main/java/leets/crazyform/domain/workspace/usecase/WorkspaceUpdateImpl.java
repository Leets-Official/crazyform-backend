package leets.crazyform.domain.workspace.usecase;

import leets.crazyform.domain.workspace.domain.Workspace;
import leets.crazyform.domain.workspace.exception.WorkspaceNotFoundException;
import leets.crazyform.domain.workspace.repository.WorkspaceRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public class WorkspaceUpdateImpl implements WorkspaceUpdate {
    private final WorkspaceRepository workspaceRepository;

    public WorkspaceUpdateImpl(WorkspaceRepository workspaceRepository) {
        this.workspaceRepository = workspaceRepository;
    }

    @Override
    public Workspace updateWorkspace(UUID workspaceId, String name, String handle) throws WorkspaceNotFoundException {
        Workspace workspace = workspaceRepository.findById(workspaceId)
                .orElseThrow(() -> new WorkspaceNotFoundException("Workspace not found with ID: " + workspaceId));

        workspace.setName(name);
        workspace.setHandle(handle);
        workspace.setUpdatedAt(LocalDateTime.now());

        return workspaceRepository.save(workspace);
    }
}
